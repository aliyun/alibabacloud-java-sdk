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
     * <p>The mount point of the file system visible in the application container. If this parameter is not specified, the default value /mnt/<PolarFSInstanceId> is used for the first mount. For subsequent mounts, the current mount point of the instance remains unchanged. The value must be an absolute path that starts with a forward slash (/) but cannot be the root directory (/). It can only contain letters, digits, periods (.), underscores (_), hyphens (-), and forward slashes (/). The total length cannot exceed 128 characters, the directory depth cannot exceed 6 levels, and the length of a single level cannot exceed 63 characters. The mount point cannot be identical to or a subdirectory of the mount points of other file systems under the same application.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/datasets</p>
     */
    @NameInMap("ContainerMountPath")
    public String containerMountPath;

    /**
     * <p>The AccessKey ID of the Alibaba Cloud account or RAM user. Ensure that the account or RAM user is authorized when you create the PolarLakebase instance.</p>
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
     * <p>The PolarLakebase cold storage instance ID.</p>
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

    public AttachApplicationPolarFSRequest setContainerMountPath(String containerMountPath) {
        this.containerMountPath = containerMountPath;
        return this;
    }
    public String getContainerMountPath() {
        return this.containerMountPath;
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
