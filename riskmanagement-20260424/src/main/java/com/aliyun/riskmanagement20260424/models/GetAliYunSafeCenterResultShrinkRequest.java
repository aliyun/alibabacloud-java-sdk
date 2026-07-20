// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAliYunSafeCenterResultShrinkRequest extends TeaModel {
    @NameInMap("CreateSimilarSecurityEventsQueryTaskRequest")
    public String createSimilarSecurityEventsQueryTaskRequestShrink;

    @NameInMap("DescribeInstancesFullStatusRequest")
    public String describeInstancesFullStatusRequestShrink;

    @NameInMap("DescribeSecurityEventOperationStatusRequest")
    public String describeSecurityEventOperationStatusRequestShrink;

    @NameInMap("DescribeSimilarSecurityEventsRequest")
    public String describeSimilarSecurityEventsRequestShrink;

    @NameInMap("GetAssetDetailByUuidRequest")
    public String getAssetDetailByUuidRequestShrink;

    @NameInMap("HandleSecurityEventsRequest")
    public String handleSecurityEventsRequestShrink;

    @NameInMap("HandleSimilarSecurityEventsRequest")
    public String handleSimilarSecurityEventsRequestShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ListInstanceStatus</p>
     */
    @NameInMap("InterfaceCode")
    public String interfaceCode;

    @NameInMap("ListInstancesRequest")
    public String listInstancesRequestShrink;

    /**
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
