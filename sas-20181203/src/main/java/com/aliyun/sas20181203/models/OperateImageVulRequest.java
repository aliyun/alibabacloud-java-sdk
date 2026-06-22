// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateImageVulRequest extends TeaModel {
    /**
     * <p>The information about the vulnerability to be processed. This parameter is in JSON format and contains the following fields:</p>
     * <ul>
     * <li>namespace: the image namespace.</li>
     * <li>repoName: the name of the ACR image repository.</li>
     * <li>regionId: the region.</li>
     * <li>instanceId: the ID of the ACR instance.</li>
     * <li>repoId: the ID of the repository.</li>
     * <li>tag: the original tag of the image.</li>
     * <li>digest: the digest of the image.</li>
     * <li>newTag: the tag of the image after the fix.</li>
     * <li>uuid: the UUID of the image.</li>
     * <li>ids: the list of primary key IDs of the vulnerabilities.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;namespace\&quot;:\&quot;cloud_oa****\&quot;,\&quot;repoName\&quot;:\&quot;hybirdc****\&quot;,\&quot;regionId\&quot;:\&quot;cn-shanghai\&quot;,\&quot;instanceId\&quot;:\&quot;cri-rv4nvbv8iju4****\&quot;,\&quot;repoId\&quot;:\&quot;crr-2q7302qrofxg****\&quot;,\&quot;tag\&quot;:\&quot;hybird-cloud-web_fix_167115945****\&quot;,\&quot;digest\&quot;:\&quot;e1a4fd25884ca2ef8840bb252c9926e4f549df9e046500dd93539b2d458c****\&quot;,\&quot;newTag\&quot;:\&quot;hybird-cloud-web_fix_167115996****\&quot;,\&quot;uuid\&quot;:\&quot;4ad91dd8c0c02de6574fa98085d0****\&quot;,\&quot;ids\&quot;:[197540864,197540865,197540869]}]</p>
     */
    @NameInMap("Info")
    public String info;

    /**
     * <p>The operation type for image vulnerability fix. Set this parameter to vul_fix.</p>
     * 
     * <strong>example:</strong>
     * <p>vul_fix</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The vulnerability type. Set this parameter to cve.</p>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    public static OperateImageVulRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateImageVulRequest self = new OperateImageVulRequest();
        return TeaModel.build(map, self);
    }

    public OperateImageVulRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public OperateImageVulRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateImageVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
