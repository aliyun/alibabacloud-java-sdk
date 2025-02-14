// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCloudVendorTrialConfigRequest extends TeaModel {
    /**
     * <p>Unique ID of the AK.</p>
     * <blockquote>
     * <h2>You can call <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> to get the AuthId.</h2>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2363</p>
     */
    @NameInMap("AuthId")
    public Long authId;

    /**
     * <p>Enter multi-cloud configuration information:</p>
     * <ul>
     * <li><em>AWS</em>: Parameters include sqsQueueName, sqsRegion</li>
     * <li><em>Tencent</em>: Parameters include kafkaUserName, kafkaBootstrapServers, kafkaTopic</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;sqsRegion\&quot;:\&quot;us-west-2\&quot;,\&quot;sqsQueueName\&quot;:\&quot;****\&quot;}</p>
     */
    @NameInMap("AuthInfo")
    public String authInfo;

    /**
     * <p>Cloud asset vendor. Values:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Tencent Cloud</li>
     * <li><strong>AWS</strong>: AWS (Note: The original text incorrectly states \&quot;Microsoft\&quot;, which should be \&quot;AWS\&quot; based on context.)</li>
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
