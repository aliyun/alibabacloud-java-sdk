// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAliYunSafeCenterResultShrinkRequest extends TeaModel {
    /**
     * <p>Creates a node to query security alerting events triggered by the same rule or alerting type.</p>
     */
    @NameInMap("CreateSimilarSecurityEventsQueryTaskRequest")
    public String createSimilarSecurityEventsQueryTaskRequestShrink;

    /**
     * <p>Queries the running status of ECS instances.</p>
     */
    @NameInMap("DescribeInstancesFullStatusRequest")
    public String describeInstancesFullStatusRequestShrink;

    /**
     * <p>Queries whether the list of security alerting events that match the same IP rule or same alerting type as the alerting event to be handled is empty.</p>
     */
    @NameInMap("DescribeSecurityEventOperationStatusRequest")
    public String describeSecurityEventOperationStatusRequestShrink;

    /**
     * <p>Queries identical security alert events in Security Center.</p>
     */
    @NameInMap("DescribeSimilarSecurityEventsRequest")
    public String describeSimilarSecurityEventsRequestShrink;

    /**
     * <p>The request parameters for querying the Security Center Agent status.</p>
     */
    @NameInMap("GetAssetDetailByUuidRequest")
    public String getAssetDetailByUuidRequestShrink;

    /**
     * <p>Handles security alert events.</p>
     */
    @NameInMap("HandleSecurityEventsRequest")
    public String handleSecurityEventsRequestShrink;

    /**
     * <p>Handles security alert events in batches based on the same IP rule or type.</p>
     */
    @NameInMap("HandleSimilarSecurityEventsRequest")
    public String handleSimilarSecurityEventsRequestShrink;

    /**
     * <p>The code of the public API operation.</p>
     * <ul>
     * <li><p><strong>GetAssetDetailByUuid</strong>: Retrieves the Agent status. Request parameter: GetAssetDetailByUuidRequest.</p>
     * </li>
     * <li><p><strong>DescribeSimilarSecurityEvents</strong>: Retrieves the list of instance IDs for identical security alerting events. Request parameter: DescribeSimilarSecurityEventsRequest.</p>
     * </li>
     * <li><p><strong>CreateSimilarSecurityEventsQueryTask</strong>: Creates a node to query security alerting events triggered by the same rule or alerting type. Request parameter: CreateSimilarSecurityEventsQueryTaskRequest.</p>
     * </li>
     * <li><p><strong>DescribeSecurityEventOperationStatus</strong>: Queries whether the list of security alerting events that match the same IP rule or same alerting type as the alerting event to be handled is empty. Request parameter: DescribeSecurityEventOperationStatusRequest.</p>
     * </li>
     * <li><p><strong>HandleSimilarSecurityEvents</strong>: Handles security alerting events in batches based on the same IP rule or type. Request parameter: HandleSimilarSecurityEventsRequest.
     * HandleSecurityEvents: Handles security alerting events. Request parameter: HandleSecurityEventsRequest.</p>
     * </li>
     * <li><p><strong>DescribeInstancesFullStatus</strong>: Queries the running status of ECS instances. Request parameter: DescribeInstancesFullStatusRequest.</p>
     * </li>
     * <li><p><strong>ListInstances</strong>: Queries the running status of simple application servers. Request parameter: ListInstancesRequest.</p>
     * </li>
     * <li><p><strong>StartConfigRuleEvaluation</strong>: Re-evaluates security check rules.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Each API operation name corresponds to its own request parameters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ListInstanceStatus</p>
     */
    @NameInMap("InterfaceCode")
    public String interfaceCode;

    /**
     * <p>Queries the running status of simple application servers.</p>
     */
    @NameInMap("ListInstancesRequest")
    public String listInstancesRequestShrink;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetAliYunSafeCenterResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAliYunSafeCenterResultShrinkRequest self = new GetAliYunSafeCenterResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAliYunSafeCenterResultShrinkRequest setCreateSimilarSecurityEventsQueryTaskRequestShrink(String createSimilarSecurityEventsQueryTaskRequestShrink) {
        this.createSimilarSecurityEventsQueryTaskRequestShrink = createSimilarSecurityEventsQueryTaskRequestShrink;
        return this;
    }
    public String getCreateSimilarSecurityEventsQueryTaskRequestShrink() {
        return this.createSimilarSecurityEventsQueryTaskRequestShrink;
    }

    public GetAliYunSafeCenterResultShrinkRequest setDescribeInstancesFullStatusRequestShrink(String describeInstancesFullStatusRequestShrink) {
        this.describeInstancesFullStatusRequestShrink = describeInstancesFullStatusRequestShrink;
        return this;
    }
    public String getDescribeInstancesFullStatusRequestShrink() {
        return this.describeInstancesFullStatusRequestShrink;
    }

    public GetAliYunSafeCenterResultShrinkRequest setDescribeSecurityEventOperationStatusRequestShrink(String describeSecurityEventOperationStatusRequestShrink) {
        this.describeSecurityEventOperationStatusRequestShrink = describeSecurityEventOperationStatusRequestShrink;
        return this;
    }
    public String getDescribeSecurityEventOperationStatusRequestShrink() {
        return this.describeSecurityEventOperationStatusRequestShrink;
    }

    public GetAliYunSafeCenterResultShrinkRequest setDescribeSimilarSecurityEventsRequestShrink(String describeSimilarSecurityEventsRequestShrink) {
        this.describeSimilarSecurityEventsRequestShrink = describeSimilarSecurityEventsRequestShrink;
        return this;
    }
    public String getDescribeSimilarSecurityEventsRequestShrink() {
        return this.describeSimilarSecurityEventsRequestShrink;
    }

    public GetAliYunSafeCenterResultShrinkRequest setGetAssetDetailByUuidRequestShrink(String getAssetDetailByUuidRequestShrink) {
        this.getAssetDetailByUuidRequestShrink = getAssetDetailByUuidRequestShrink;
        return this;
    }
    public String getGetAssetDetailByUuidRequestShrink() {
        return this.getAssetDetailByUuidRequestShrink;
    }

    public GetAliYunSafeCenterResultShrinkRequest setHandleSecurityEventsRequestShrink(String handleSecurityEventsRequestShrink) {
        this.handleSecurityEventsRequestShrink = handleSecurityEventsRequestShrink;
        return this;
    }
    public String getHandleSecurityEventsRequestShrink() {
        return this.handleSecurityEventsRequestShrink;
    }

    public GetAliYunSafeCenterResultShrinkRequest setHandleSimilarSecurityEventsRequestShrink(String handleSimilarSecurityEventsRequestShrink) {
        this.handleSimilarSecurityEventsRequestShrink = handleSimilarSecurityEventsRequestShrink;
        return this;
    }
    public String getHandleSimilarSecurityEventsRequestShrink() {
        return this.handleSimilarSecurityEventsRequestShrink;
    }

    public GetAliYunSafeCenterResultShrinkRequest setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }
    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    public GetAliYunSafeCenterResultShrinkRequest setListInstancesRequestShrink(String listInstancesRequestShrink) {
        this.listInstancesRequestShrink = listInstancesRequestShrink;
        return this;
    }
    public String getListInstancesRequestShrink() {
        return this.listInstancesRequestShrink;
    }

    public GetAliYunSafeCenterResultShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
