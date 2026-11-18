// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AttachApplicationPolarFSRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The AccessKey ID of the Alibaba Cloud account or RAM user. Ensure that the account or RAM user is authorized when you create the Polarlakebase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>LT**********************</p>
     */
    @NameInMap("PolarFSAccessKeyId")
    public String polarFSAccessKeyId;

    /**
     * <p>The AccessKey secret of the Alibaba Cloud account or RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>H3****************************</p>
     */
    @NameInMap("PolarFSAccessKeySecret")
    public String polarFSAccessKeySecret;

    /**
     * <p>The instance ID of the Polarlakebase cold storage instance.</p>
     * <p>Currently, only the following applications support cold storage instances:</p>
     * <ul>
     * <li>supabase</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pcs-**************</p>
     */
    @NameInMap("PolarFSInstanceId")
    public String polarFSInstanceId;

    public static AttachApplicationPolarFSRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachApplicationPolarFSRequest self = new AttachApplicationPolarFSRequest();
        return TeaModel.build(map, self);
    }

    public AttachApplicationPolarFSRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public AttachApplicationPolarFSRequest setPolarFSAccessKeyId(String polarFSAccessKeyId) {
        this.polarFSAccessKeyId = polarFSAccessKeyId;
        return this;
    }
    public String getPolarFSAccessKeyId() {
        return this.polarFSAccessKeyId;
    }

    public AttachApplicationPolarFSRequest setPolarFSAccessKeySecret(String polarFSAccessKeySecret) {
        this.polarFSAccessKeySecret = polarFSAccessKeySecret;
        return this;
    }
    public String getPolarFSAccessKeySecret() {
        return this.polarFSAccessKeySecret;
    }

    public AttachApplicationPolarFSRequest setPolarFSInstanceId(String polarFSInstanceId) {
        this.polarFSInstanceId = polarFSInstanceId;
        return this;
    }
    public String getPolarFSInstanceId() {
        return this.polarFSInstanceId;
    }

}
