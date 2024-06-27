// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafConsoleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("content")
    public String content;

    /**
     * <p>This parameter is required.</p>
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
