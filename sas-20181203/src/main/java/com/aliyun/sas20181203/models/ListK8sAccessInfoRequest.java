// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListK8sAccessInfoRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("AliyunYundunGatewayApiName")
    public String aliyunYundunGatewayApiName;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("AliyunYundunGatewayPopName")
    public String aliyunYundunGatewayPopName;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("AliyunYundunGatewayProjectName")
    public String aliyunYundunGatewayProjectName;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static ListK8sAccessInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListK8sAccessInfoRequest self = new ListK8sAccessInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListK8sAccessInfoRequest setAliyunYundunGatewayApiName(String aliyunYundunGatewayApiName) {
        this.aliyunYundunGatewayApiName = aliyunYundunGatewayApiName;
        return this;
    }
    public String getAliyunYundunGatewayApiName() {
        return this.aliyunYundunGatewayApiName;
    }

    public ListK8sAccessInfoRequest setAliyunYundunGatewayPopName(String aliyunYundunGatewayPopName) {
        this.aliyunYundunGatewayPopName = aliyunYundunGatewayPopName;
        return this;
    }
    public String getAliyunYundunGatewayPopName() {
        return this.aliyunYundunGatewayPopName;
    }

    public ListK8sAccessInfoRequest setAliyunYundunGatewayProjectName(String aliyunYundunGatewayProjectName) {
        this.aliyunYundunGatewayProjectName = aliyunYundunGatewayProjectName;
        return this;
    }
    public String getAliyunYundunGatewayProjectName() {
        return this.aliyunYundunGatewayProjectName;
    }

    public ListK8sAccessInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
