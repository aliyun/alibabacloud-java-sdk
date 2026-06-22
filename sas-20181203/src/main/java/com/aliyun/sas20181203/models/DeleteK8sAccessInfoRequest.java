// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteK8sAccessInfoRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated and can be ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AliyunYundunGatewayApiName")
    public String aliyunYundunGatewayApiName;

    /**
     * <p>This parameter is deprecated and can be ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AliyunYundunGatewayPopName")
    public String aliyunYundunGatewayPopName;

    /**
     * <p>This parameter is deprecated and can be ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AliyunYundunGatewayProjectName")
    public String aliyunYundunGatewayProjectName;

    /**
     * <p>The default value generated when accessing Kubernetes. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/2623602.html">GenerateK8sAccessInfo</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteK8sAccessInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sAccessInfoRequest self = new DeleteK8sAccessInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteK8sAccessInfoRequest setAliyunYundunGatewayApiName(String aliyunYundunGatewayApiName) {
        this.aliyunYundunGatewayApiName = aliyunYundunGatewayApiName;
        return this;
    }
    public String getAliyunYundunGatewayApiName() {
        return this.aliyunYundunGatewayApiName;
    }

    public DeleteK8sAccessInfoRequest setAliyunYundunGatewayPopName(String aliyunYundunGatewayPopName) {
        this.aliyunYundunGatewayPopName = aliyunYundunGatewayPopName;
        return this;
    }
    public String getAliyunYundunGatewayPopName() {
        return this.aliyunYundunGatewayPopName;
    }

    public DeleteK8sAccessInfoRequest setAliyunYundunGatewayProjectName(String aliyunYundunGatewayProjectName) {
        this.aliyunYundunGatewayProjectName = aliyunYundunGatewayProjectName;
        return this;
    }
    public String getAliyunYundunGatewayProjectName() {
        return this.aliyunYundunGatewayProjectName;
    }

    public DeleteK8sAccessInfoRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
