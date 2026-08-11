// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AcceptOperationTicketRequest extends TeaModel {
    /**
     * <p>The approval remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The limit on the number of logons allowed. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: No limit on the number of logons. The O&amp;M engineer can log on an unlimited number of times during the validity period.</p>
     * </li>
     * <li><p><strong>1</strong>: The O&amp;M engineer can log on only once during the validity period.</p>
     * <blockquote>
     * <ul>
     * <li>The logon limit for database asset O&amp;M approval can only be set to unlimited.</li>
     * <li>If an empty character string is passed, the default value is unlimited.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EffectCount")
    public String effectCount;

    /**
     * <p>The end time of the validity period for logon (in seconds, UNIX timestamp format).</p>
     * 
     * <strong>example:</strong>
     * <p>1679393152</p>
     */
    @NameInMap("EffectEndTime")
    public String effectEndTime;

    /**
     * <p>The start time of the validity period for logon (in seconds, UNIX timestamp format).</p>
     * 
     * <strong>example:</strong>
     * <p>1685600242</p>
     */
    @NameInMap("EffectStartTime")
    public String effectStartTime;

    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the O&amp;M request to approve.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2584313.html">ListOperationTickets</a> operation to query all OperationTicketId values that require approval.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OperationTicketId")
    public String operationTicketId;

    /**
     * <p>The project ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AcceptOperationTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptOperationTicketRequest self = new AcceptOperationTicketRequest();
        return TeaModel.build(map, self);
    }

    public AcceptOperationTicketRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AcceptOperationTicketRequest setEffectCount(String effectCount) {
        this.effectCount = effectCount;
        return this;
    }
    public String getEffectCount() {
        return this.effectCount;
    }

    public AcceptOperationTicketRequest setEffectEndTime(String effectEndTime) {
        this.effectEndTime = effectEndTime;
        return this;
    }
    public String getEffectEndTime() {
        return this.effectEndTime;
    }

    public AcceptOperationTicketRequest setEffectStartTime(String effectStartTime) {
        this.effectStartTime = effectStartTime;
        return this;
    }
    public String getEffectStartTime() {
        return this.effectStartTime;
    }

    public AcceptOperationTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AcceptOperationTicketRequest setOperationTicketId(String operationTicketId) {
        this.operationTicketId = operationTicketId;
        return this;
    }
    public String getOperationTicketId() {
        return this.operationTicketId;
    }

    public AcceptOperationTicketRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AcceptOperationTicketRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
