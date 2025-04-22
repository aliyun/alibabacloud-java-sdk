// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ReceivedMsg extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("has_read")
    public Boolean hasRead;

    /**
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("msg_category")
    public String msgCategory;

    @NameInMap("msg_content")
    public ReceivedMsgMsgContent msgContent;

    /**
     * <strong>example:</strong>
     * <p>50d6f2aaa16525c7d053998e48fac265962f585f</p>
     */
    @NameInMap("msg_id")
    public String msgId;

    /**
     * <strong>example:</strong>
     * <p>change_user_setting</p>
     */
    @NameInMap("msg_sub_category")
    public String msgSubCategory;

    /**
     * <strong>example:</strong>
     * <p>edit_user</p>
     */
    @NameInMap("msg_type")
    public String msgType;

    /**
     * <strong>example:</strong>
     * <p>1716363191123</p>
     */
    @NameInMap("publish_at")
    public Long publishAt;

    /**
     * <strong>example:</strong>
     * <p>1716363191123</p>
     */
    @NameInMap("read_at")
    public Long readAt;

    public static ReceivedMsg build(java.util.Map<String, ?> map) throws Exception {
        ReceivedMsg self = new ReceivedMsg();
        return TeaModel.build(map, self);
    }

    public ReceivedMsg setHasRead(Boolean hasRead) {
        this.hasRead = hasRead;
        return this;
    }
    public Boolean getHasRead() {
        return this.hasRead;
    }

    public ReceivedMsg setMsgCategory(String msgCategory) {
        this.msgCategory = msgCategory;
        return this;
    }
    public String getMsgCategory() {
        return this.msgCategory;
    }

    public ReceivedMsg setMsgContent(ReceivedMsgMsgContent msgContent) {
        this.msgContent = msgContent;
        return this;
    }
    public ReceivedMsgMsgContent getMsgContent() {
        return this.msgContent;
    }

    public ReceivedMsg setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public ReceivedMsg setMsgSubCategory(String msgSubCategory) {
        this.msgSubCategory = msgSubCategory;
        return this;
    }
    public String getMsgSubCategory() {
        return this.msgSubCategory;
    }

    public ReceivedMsg setMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }
    public String getMsgType() {
        return this.msgType;
    }

    public ReceivedMsg setPublishAt(Long publishAt) {
        this.publishAt = publishAt;
        return this;
    }
    public Long getPublishAt() {
        return this.publishAt;
    }

    public ReceivedMsg setReadAt(Long readAt) {
        this.readAt = readAt;
        return this;
    }
    public Long getReadAt() {
        return this.readAt;
    }

    public static class ReceivedMsgMsgContent extends TeaModel {
        @NameInMap("msg_data")
        public java.util.Map<String, ?> msgData;

        public static ReceivedMsgMsgContent build(java.util.Map<String, ?> map) throws Exception {
            ReceivedMsgMsgContent self = new ReceivedMsgMsgContent();
            return TeaModel.build(map, self);
        }

        public ReceivedMsgMsgContent setMsgData(java.util.Map<String, ?> msgData) {
            this.msgData = msgData;
            return this;
        }
        public java.util.Map<String, ?> getMsgData() {
            return this.msgData;
        }

    }

}
