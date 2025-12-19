// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppServiceGroup extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("QrCode")
    public String qrCode;

    /**
     * <p>例如：dingtalk、wx 等</p>
     */
    @NameInMap("Type")
    public String type;

    @NameInMap("Url")
    public String url;

    public static AppServiceGroup build(java.util.Map<String, ?> map) throws Exception {
        AppServiceGroup self = new AppServiceGroup();
        return TeaModel.build(map, self);
    }

    public AppServiceGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppServiceGroup setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }
    public String getQrCode() {
        return this.qrCode;
    }

    public AppServiceGroup setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AppServiceGroup setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
