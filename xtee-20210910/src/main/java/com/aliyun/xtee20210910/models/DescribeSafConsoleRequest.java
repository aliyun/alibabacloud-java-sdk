// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafConsoleRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Query content.</p>
     * 
     * <strong>example:</strong>
     * <p>ei_riskLpInfo</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>Service to be called.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ei_riskLpInfo</p>
     */
    @NameInMap("service")
    public String service;

    public static DescribeSafConsoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafConsoleRequest self = new DescribeSafConsoleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSafConsoleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSafConsoleRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeSafConsoleRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
