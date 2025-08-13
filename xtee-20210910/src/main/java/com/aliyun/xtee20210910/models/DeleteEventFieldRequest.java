// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteEventFieldRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_awukck7117</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Field name</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("fieldName")
    public String fieldName;

    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DeleteEventFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventFieldRequest self = new DeleteEventFieldRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventFieldRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteEventFieldRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DeleteEventFieldRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public DeleteEventFieldRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
