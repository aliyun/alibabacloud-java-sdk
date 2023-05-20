// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateRegistryTypeRequest extends TeaModel {
    /**
     * <p>请求和接收消息的语言类型。取值：</p>
     * <p>- **zh**：中文</p>
     * <p>- **en**：英文</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static ListPrivateRegistryTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateRegistryTypeRequest self = new ListPrivateRegistryTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateRegistryTypeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
