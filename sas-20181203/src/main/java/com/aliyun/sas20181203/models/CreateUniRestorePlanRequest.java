// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUniRestorePlanRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>qtc</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The unique identifier of the database backup client on the destination server for restoration.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeUniBackupDatabase~~">DescribeUniBackupDatabase</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ac457b30598d11ed800000163e02****</p>
     */
    @NameInMap("InstanceUuid")
    public String instanceUuid;

    /**
     * <p>The ID of the database anti-ransomware backup policy.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeUniBackupPolicies~~">DescribeUniBackupPolicies</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The <strong>reset_scn</strong> value of the selected record from the recoverable points in time when you query backups for an Oracle database.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeUniRecoverableList~~">DescribeUniRecoverableList</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>925702.0</p>
     */
    @NameInMap("ResetScn")
    public String resetScn;

    /**
     * <p>The <strong>reset_time</strong> value of the selected record from the recoverable points in time when you query backups for an Oracle database.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeUniRecoverableList~~">DescribeUniRecoverableList</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-10-29 01:06:24</p>
     */
    @NameInMap("ResetTime")
    public String resetTime;

    /**
     * <p>The database restoration information when the database type is MSSQL. The value is a JSON string. Valid values:</p>
     * <ul>
     * <li><strong>name</strong>: the name of the database.</li>
     * <li><strong>files</strong>: the file path of the database.<blockquote>
     * <p>Call the <a href="~~DescribeUniRecoverableList~~">DescribeUniRecoverableList</a> operation to obtain this parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;files&quot;: {&quot;qtc&quot;:&quot;F:\\database\\qtc.mdf&quot;,&quot;qtc_log&quot;:&quot;F:\\database\\qtc_0.ldf&quot;},
     * &quot;name&quot;:&quot;qtc&quot;}</p>
     */
    @NameInMap("RestoreInfo")
    public String restoreInfo;

    /**
     * <p>The point in time to which you want to restore the database.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeRestorePlans~~">DescribeRestorePlans</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656957664000</p>
     */
    @NameInMap("TimePoint")
    public Long timePoint;

    public static CreateUniRestorePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUniRestorePlanRequest self = new CreateUniRestorePlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateUniRestorePlanRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public CreateUniRestorePlanRequest setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    public CreateUniRestorePlanRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public CreateUniRestorePlanRequest setResetScn(String resetScn) {
        this.resetScn = resetScn;
        return this;
    }
    public String getResetScn() {
        return this.resetScn;
    }

    public CreateUniRestorePlanRequest setResetTime(String resetTime) {
        this.resetTime = resetTime;
        return this;
    }
    public String getResetTime() {
        return this.resetTime;
    }

    public CreateUniRestorePlanRequest setRestoreInfo(String restoreInfo) {
        this.restoreInfo = restoreInfo;
        return this;
    }
    public String getRestoreInfo() {
        return this.restoreInfo;
    }

    public CreateUniRestorePlanRequest setTimePoint(Long timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public Long getTimePoint() {
        return this.timePoint;
    }

}
