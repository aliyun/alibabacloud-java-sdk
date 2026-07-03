// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateEnterpriseCodeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The enterprise code.</p>
     * <p>The enterprise code must be 5 characters in length and contain both letters and digits. The letters can be uppercase or lowercase. The enterprise code must be globally unique and cannot be the same as that of another enterprise.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12P**</p>
     */
    @NameInMap("EnterpriseCode")
    public String enterpriseCode;

    /**
     * <p>The region ID.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> to query the regions supported by Smart Access Gateway and the corresponding region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateEnterpriseCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseCodeRequest self = new CreateEnterpriseCodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseCodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEnterpriseCodeRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public CreateEnterpriseCodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
