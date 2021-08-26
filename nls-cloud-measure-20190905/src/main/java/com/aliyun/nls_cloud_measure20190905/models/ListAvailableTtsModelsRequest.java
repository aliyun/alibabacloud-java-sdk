// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nls_cloud_measure20190905.models;

import com.aliyun.tea.*;

public class ListAvailableTtsModelsRequest extends TeaModel {
    @NameInMap("AliyunLang")
    public String aliyunLang;

    public static ListAvailableTtsModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableTtsModelsRequest self = new ListAvailableTtsModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableTtsModelsRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

}
