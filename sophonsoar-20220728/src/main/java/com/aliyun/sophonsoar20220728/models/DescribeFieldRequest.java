// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeFieldRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The key of the global configuration. Valid values:</p>
     * <br>
     * <p>*   **soar_filed_tags**: queries the input template of the playbook.</p>
     */
    @NameInMap("QueryKey")
    public String queryKey;

    public static DescribeFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldRequest self = new DescribeFieldRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFieldRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFieldRequest setQueryKey(String queryKey) {
        this.queryKey = queryKey;
        return this;
    }
    public String getQueryKey() {
        return this.queryKey;
    }

}
