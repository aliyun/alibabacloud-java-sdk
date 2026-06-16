// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateRplInspectionTaskRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraDB RDS instance to which the migration object belongs in the target instance. &gt; You can invoke the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all ApsaraDB RDS instances in the specified region, including instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>transfer_test3</p>
     */
    @NameInMap("DstDb")
    public String dstDb;

    /**
     * <p>The password of the privileged account for the destination ApsaraDB RDS instance. &gt; * The password must be 8 to 32 characters in length. * The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. * Special characters include ! @ # $ &amp; % ^ * ( ) _ + - =.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DstPassword")
    public String dstPassword;

    /**
     * <p>The destination task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-zkrc1****l54rc</p>
     */
    @NameInMap("DstResId")
    public String dstResId;

    /**
     * <p>The username used to connect to the target instance.</p>
     * 
     * <strong>example:</strong>
     * <p>bbt_item</p>
     */
    @NameInMap("DstUserName")
    public String dstUserName;

    /**
     * <p>The region ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The switchover task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>etx-szr2rr6i*****</p>
     */
    @NameInMap("SlinkTaskId")
    public String slinkTaskId;

    /**
     * <p>The password of the source ApsaraDB RDS instance. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the specified region, including the password.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcPassword")
    public String srcPassword;

    /**
     * <p>The username used to connect to the source instance (source database).</p>
     * 
     * <strong>example:</strong>
     * <p>bbt_ump</p>
     */
    @NameInMap("SrcUserName")
    public String srcUserName;

    public static CreateRplInspectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRplInspectionTaskRequest self = new CreateRplInspectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRplInspectionTaskRequest setDstDb(String dstDb) {
        this.dstDb = dstDb;
        return this;
    }
    public String getDstDb() {
        return this.dstDb;
    }

    public CreateRplInspectionTaskRequest setDstPassword(String dstPassword) {
        this.dstPassword = dstPassword;
        return this;
    }
    public String getDstPassword() {
        return this.dstPassword;
    }

    public CreateRplInspectionTaskRequest setDstResId(String dstResId) {
        this.dstResId = dstResId;
        return this;
    }
    public String getDstResId() {
        return this.dstResId;
    }

    public CreateRplInspectionTaskRequest setDstUserName(String dstUserName) {
        this.dstUserName = dstUserName;
        return this;
    }
    public String getDstUserName() {
        return this.dstUserName;
    }

    public CreateRplInspectionTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRplInspectionTaskRequest setSlinkTaskId(String slinkTaskId) {
        this.slinkTaskId = slinkTaskId;
        return this;
    }
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    public CreateRplInspectionTaskRequest setSrcPassword(String srcPassword) {
        this.srcPassword = srcPassword;
        return this;
    }
    public String getSrcPassword() {
        return this.srcPassword;
    }

    public CreateRplInspectionTaskRequest setSrcUserName(String srcUserName) {
        this.srcUserName = srcUserName;
        return this;
    }
    public String getSrcUserName() {
        return this.srcUserName;
    }

}
