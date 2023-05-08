// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecureSuggestionRequest extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>An array that consists of the unhandled security risks.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSecureSuggestionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecureSuggestionRequest self = new DescribeSecureSuggestionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecureSuggestionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSecureSuggestionRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
