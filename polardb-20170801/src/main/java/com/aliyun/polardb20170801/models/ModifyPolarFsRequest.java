// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPolarFsRequest extends TeaModel {
    /**
     * <p>The custom OSS AccessKey ID. You must specify this parameter together with CustomOssSk when you call the ModifyPolarFs operation. Otherwise, the InvalidCustomIdentityInfo.Malformed (400) error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI5tExample1234</p>
     */
    @NameInMap("CustomOssAk")
    public String customOssAk;

    /**
     * <p>The custom OSS AccessKey Secret. You must specify this parameter together with CustomOssAk when you call the ModifyPolarFs operation. Otherwise, the InvalidCustomIdentityInfo.Malformed (400) error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>example-oss-secret</p>
     */
    @NameInMap("CustomOssSk")
    public String customOssSk;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query information about all clusters in the specified region, including cluster IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The PolarFs instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static ModifyPolarFsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarFsRequest self = new ModifyPolarFsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolarFsRequest setCustomOssAk(String customOssAk) {
        this.customOssAk = customOssAk;
        return this;
    }
    public String getCustomOssAk() {
        return this.customOssAk;
    }

    public ModifyPolarFsRequest setCustomOssSk(String customOssSk) {
        this.customOssSk = customOssSk;
        return this;
    }
    public String getCustomOssSk() {
        return this.customOssSk;
    }

    public ModifyPolarFsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyPolarFsRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

}
