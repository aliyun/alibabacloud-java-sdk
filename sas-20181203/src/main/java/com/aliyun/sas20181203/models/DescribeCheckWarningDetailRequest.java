// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningDetailRequest extends TeaModel {
    // The ID of the alert that is triggered by the check item.
    // 
    // >  To query the details about a specified check item, you must provide the ID of the alert that is triggered by the check item. You can call the [DescribeCheckWarnings](~~DescribeCheckWarnings~~) operation to query the IDs of alerts.
    @NameInMap("CheckWarningId")
    public Long checkWarningId;

    // The language of the content within the request and the response. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeCheckWarningDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningDetailRequest self = new DescribeCheckWarningDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningDetailRequest setCheckWarningId(Long checkWarningId) {
        this.checkWarningId = checkWarningId;
        return this;
    }
    public Long getCheckWarningId() {
        return this.checkWarningId;
    }

    public DescribeCheckWarningDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCheckWarningDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
