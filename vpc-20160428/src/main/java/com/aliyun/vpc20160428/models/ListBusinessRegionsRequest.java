// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListBusinessRegionsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: </p>
     * <ul>
     * <li><p><strong>zh-CN</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en-US</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static ListBusinessRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessRegionsRequest self = new ListBusinessRegionsRequest();
        return TeaModel.build(map, self);
    }

    public ListBusinessRegionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
