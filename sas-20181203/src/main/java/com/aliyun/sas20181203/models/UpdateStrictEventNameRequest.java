// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateStrictEventNameRequest extends TeaModel {
    /**
     * <p>The list of strict mode alerts to operate on. This is a full list. Strict mode alerts not included in this list will have the opposite action applied.</p>
     * <blockquote>
     * <p>Call <a href="~~DescribeStrictEventName~~">DescribeStrictEventName</a> to obtain the list of all strict mode alerts.
     * -.</p>
     * </blockquote>
     */
    @NameInMap("EventNameList")
    public java.util.List<String> eventNameList;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operator for the rule action. Valid values:</p>
     * <ul>
     * <li><em>on</em>: enables alerting</li>
     * <li><em>off</em>: disables alerting.</li>
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
