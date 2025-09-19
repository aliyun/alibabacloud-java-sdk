// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCloudVendorTrialConfigRequest extends TeaModel {
    /**
     * <p>The AccessKey ID.</p>
     * <blockquote>
     * <p> <a href="#-describecloudvendoraccountaklist--authid"></a>You can call the <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> operation to query the AccessKey ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2363</p>
     */
    @NameInMap("AuthId")
    public Long authId;

    /**
     * <p>The configurations of the third-party cloud asset. Valid values:</p>
     * <ul>
     * <li><em>AWS</em>: Configure the sqsQueueName and sqsRegion parameters.</li>
     * <li><em>Tencent</em>: Configure the kafkaUserName, kafkaBootstrapServers, and kafkaTopic parameters.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;sqsRegion\&quot;:\&quot;us-west-2\&quot;,\&quot;sqsQueueName\&quot;:\&quot;****\&quot;}</p>
     */
    @NameInMap("AuthInfo")
    public String authInfo;

    /**
     * <p>The service provider of the cloud asset. Valid values:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Tencent Cloud.</li>
     * <li><strong>AWS</strong>: Amazon Web Services (AWS).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static AddCloudVendorTrialConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCloudVendorTrialConfigRequest self = new AddCloudVendorTrialConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddCloudVendorTrialConfigRequest setAuthId(Long authId) {
        this.authId = authId;
        return this;
    }
    public Long getAuthId() {
        return this.authId;
    }

    public AddCloudVendorTrialConfigRequest setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public String getAuthInfo() {
        return this.authInfo;
    }

    public AddCloudVendorTrialConfigRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
