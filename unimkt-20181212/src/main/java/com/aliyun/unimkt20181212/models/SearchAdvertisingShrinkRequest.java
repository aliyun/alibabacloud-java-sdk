// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class SearchAdvertisingShrinkRequest extends TeaModel {
    @NameInMap("App")
    public String appShrink;

    @NameInMap("Device")
    public String deviceShrink;

    @NameInMap("Ext")
    public String extShrink;

    @NameInMap("Id")
    public String id;

    @NameInMap("Imp")
    public String impShrink;

    @NameInMap("Test")
    public Integer test;

    @NameInMap("User")
    public String userShrink;

    public static SearchAdvertisingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAdvertisingShrinkRequest self = new SearchAdvertisingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchAdvertisingShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public SearchAdvertisingShrinkRequest setDeviceShrink(String deviceShrink) {
        this.deviceShrink = deviceShrink;
        return this;
    }
    public String getDeviceShrink() {
        return this.deviceShrink;
    }

    public SearchAdvertisingShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public SearchAdvertisingShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SearchAdvertisingShrinkRequest setImpShrink(String impShrink) {
        this.impShrink = impShrink;
        return this;
    }
    public String getImpShrink() {
        return this.impShrink;
    }

    public SearchAdvertisingShrinkRequest setTest(Integer test) {
        this.test = test;
        return this;
    }
    public Integer getTest() {
        return this.test;
    }

    public SearchAdvertisingShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

}
