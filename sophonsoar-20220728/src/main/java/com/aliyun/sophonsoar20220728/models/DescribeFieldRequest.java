// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeFieldRequest extends TeaModel {
    /**
     * <p>The language of the request and response messages. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The key of the global configuration. Valid value:</p>
     * <ul>
     * <li><strong>soar_filed_tags</strong>: Obtains the input field template for a playbook.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>soar_filed_tags</p>
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
