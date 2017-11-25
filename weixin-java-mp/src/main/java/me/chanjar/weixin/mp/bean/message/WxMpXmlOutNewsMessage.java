package me.chanjar.weixin.mp.bean.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.util.xml.XStreamCDataConverter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XStreamAlias("xml")
public class WxMpXmlOutNewsMessage extends WxMpXmlOutMessage {
    private static final long serialVersionUID = -4604402850905714772L;

    /**
     * 是	多条图文消息信息，默认第一个item为大图,注意，如果图文数超过8，则将会无响应
     */
    @XStreamAlias("Articles")
    protected final List<Item> articles = new ArrayList<>();

    /**
     * 是	图文消息个数，限制为8条以内
     */
    @XStreamAlias("ArticleCount")
    private int articleCount;

    public WxMpXmlOutNewsMessage() {
        this.msgType = WxConsts.XML_MSG_NEWS;
    }

    public void addArticle(Item item) {
        this.articles.add(item);
        this.articleCount = this.articles.size();
    }

    /**
     * 是	多条图文消息信息，默认第一个item为大图,注意，如果图文数超过8，则将会无响应
     *
     * @return
     */
    public List<Item> getArticles() {
        return this.articles;
    }

    /**
     * 获取 是	图文消息个数，限制为8条以内
     */
    public int getArticleCount() {
        return this.articleCount;
    }

    /**
     * 设置 是	图文消息个数，限制为8条以内
     */
    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }


    @XStreamAlias("item")
    public static class Item implements Serializable {

        private static final long serialVersionUID = -4971456355028904754L;

        /**
         * 是	图文消息标题
         */
        @XStreamAlias("Title")
        @XStreamConverter(value = XStreamCDataConverter.class)
        private String Title;

        /**
         * 是	图文消息描述
         */
        @XStreamAlias("Description")
        @XStreamConverter(value = XStreamCDataConverter.class)
        private String Description;

        /**
         * 是	图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
         */
        @XStreamAlias("PicUrl")
        @XStreamConverter(value = XStreamCDataConverter.class)
        private String PicUrl;

        /**
         * 是	点击图文消息跳转链接
         */
        @XStreamAlias("Url")
        @XStreamConverter(value = XStreamCDataConverter.class)
        private String Url;


        /**
         * 获取 是	图文消息标题
         */
        public String getTitle() {
            return this.Title;
        }

        /**
         * 设置 是	图文消息标题
         */
        public void setTitle(String Title) {
            this.Title = Title;
        }

        /**
         * 获取 是	图文消息描述
         */
        public String getDescription() {
            return this.Description;
        }

        /**
         * 设置 是	图文消息描述
         */
        public void setDescription(String Description) {
            this.Description = Description;
        }

        /**
         * 获取 是	图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
         */
        public String getPicUrl() {
            return this.PicUrl;
        }

        /**
         * 设置 是	图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
         */
        public void setPicUrl(String PicUrl) {
            this.PicUrl = PicUrl;
        }

        /**
         * 获取 是	点击图文消息跳转链接
         */
        public String getUrl() {
            return this.Url;
        }

        /**
         * 设置 是	点击图文消息跳转链接
         */
        public void setUrl(String Url) {
            this.Url = Url;
        }
    }


}
