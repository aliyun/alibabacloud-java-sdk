// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AppAccessStrategy extends TeaModel {
    @NameInMap("effect")
    public String effect;

    @NameInMap("except_app_id_list")
    public java.util.List<String> exceptAppIdList;

    public static AppAccessStrategy build(java.util.Map<String, ?> map) throws Exception {
        AppAccessStrategy self = new AppAccessStrategy();
        return TeaModel.build(map, self);
    }

    public AppAccessStrategy setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public AppAccessStrategy setExceptAppIdList(java.util.List<String> exceptAppIdList) {
        this.exceptAppIdList = exceptAppIdList;
        return this;
    }
    public java.util.List<String> getExceptAppIdList() {
        return this.exceptAppIdList;
    }

}
