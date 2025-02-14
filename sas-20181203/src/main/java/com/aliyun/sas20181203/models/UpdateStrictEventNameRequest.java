// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateStrictEventNameRequest extends TeaModel {
    /**
     * <p>List of strict alarms to be operated on. This list is a complete list, and any strict alarms not included in this list will have the opposite operation performed.</p>
     * <blockquote>
     * <h2>You can call <a href="~~DescribeStrictEventName~~">DescribeStrictEventName</a> to get the list of all strict mode alarms.</h2>
     * </blockquote>
     */
    @NameInMap("EventNameList")
    public java.util.List<String> eventNameList;

    /**
     * <p>Sets the language type for requests and received messages, default is <strong>zh</strong>. Values:</p>
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
     * <p>Operation rule determination operator:</p>
     * <ul>
     * <li><em>on</em>: Turn on the alarm</li>
     * <li><em>off</em>: Turn off the alarm</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Operator")
    public String operator;

    public static UpdateStrictEventNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStrictEventNameRequest self = new UpdateStrictEventNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStrictEventNameRequest setEventNameList(java.util.List<String> eventNameList) {
        this.eventNameList = eventNameList;
        return this;
    }
    public java.util.List<String> getEventNameList() {
        return this.eventNameList;
    }

    public UpdateStrictEventNameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateStrictEventNameRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
