// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeAICallDetailsRequest extends TeaModel {
    /**
     * <p>业务版本，沿用售卖 BizType：ENTERPRISE 或 1 为企业版；BUSINESS 或 20 为商业版。未传默认企业版。</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>带时区的 ISO 8601 结束时间，整秒精度，默认当前时间；应大于开始时间且不晚于当前时间，区间左闭右开。</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-06T00:00:00+08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>网关日志地域：cn-shanghai（国内）、cn-hongkong（香港）、ap-southeast-1（新加坡）、us-east-1（美国）；兼容 cn-hangzhou，仅查询路由等同 cn-shanghai；杭州预发实际数据地域为 cn-hangzhou。不传时使用当前站点默认地域；预发只查询预发日志，国内映射杭州预发，美国预发未配置时返回 ServiceUnavailable。</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("GatewayRegion")
    public String gatewayRegion;

    /**
     * <p>可选请求模型 ID；不传或空白时不筛选，非空时精确匹配 custom_log.requestedModel 或 ai_log.request_model 任一字段，与 SearchRequestId、WyIds 等条件取交集。不按 ai_log.model 筛选，不支持模糊匹配。</p>
     * 
     * <strong>example:</strong>
     * <p>example-model</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>页码，从 1 开始；分页偏移超过查询上限时返回 InvalidParameter。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>每页返回数量，最大 50。</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>可选请求 ID；不传或空白时不筛选，非空时精确匹配 SLS request_id，与 ModelId、WyIds 等条件取交集。不得包含控制字符或管道符。</p>
     * 
     * <strong>example:</strong>
     * <p>model-call-example-001</p>
     */
    @NameInMap("SearchRequestId")
    public String searchRequestId;

    /**
     * <p>带时区的 ISO 8601 开始时间，整秒精度，默认 UTC+8 今日零点；不得早于当前时间按 UTC+8 回退 3 个自然月，区间不超过 30 天。</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T00:00:00+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>可选用户 ID 列表，最多 50 项；不传或空数组时不筛选。非空时精确匹配 custom_log.wyId，列表内取 OR，与租户、BizType、SearchRequestId 和 ModelId 条件取 AND。每项去除首尾空白后为 1 至 128 个字符，不允许控制字符或管道符。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;wy-example-001&quot;]</p>
     */
    @NameInMap("WyIds")
    public java.util.List<String> wyIds;

    public static DescribeAICallDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAICallDetailsRequest self = new DescribeAICallDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAICallDetailsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeAICallDetailsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAICallDetailsRequest setGatewayRegion(String gatewayRegion) {
        this.gatewayRegion = gatewayRegion;
        return this;
    }
    public String getGatewayRegion() {
        return this.gatewayRegion;
    }

    public DescribeAICallDetailsRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public DescribeAICallDetailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAICallDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAICallDetailsRequest setSearchRequestId(String searchRequestId) {
        this.searchRequestId = searchRequestId;
        return this;
    }
    public String getSearchRequestId() {
        return this.searchRequestId;
    }

    public DescribeAICallDetailsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAICallDetailsRequest setWyIds(java.util.List<String> wyIds) {
        this.wyIds = wyIds;
        return this;
    }
    public java.util.List<String> getWyIds() {
        return this.wyIds;
    }

}
