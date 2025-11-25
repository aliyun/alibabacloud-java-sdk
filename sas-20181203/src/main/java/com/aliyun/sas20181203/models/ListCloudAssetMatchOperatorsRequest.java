// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudAssetMatchOperatorsRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese </li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static ListCloudAssetMatchOperatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAssetMatchOperatorsRequest self = new ListCloudAssetMatchOperatorsRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAssetMatchOperatorsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
