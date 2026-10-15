// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppServiceGroup extends TeaModel {
    /**
     * <p>The name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The QR code.</p>
     */
    @NameInMap("QrCode")
    public String qrCode;

    /**
     * <p>The group type, such as dingtalk and wx.</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/example.jpg">https://example.com/example.jpg</a></p>
     */
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
