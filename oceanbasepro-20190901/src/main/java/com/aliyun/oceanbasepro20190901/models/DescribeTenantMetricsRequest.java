// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantMetricsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-13T15:45:43Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>2021-06-13T15:40:43Z</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>{&quot;name&quot;:&quot;DescribeTenantMetrics&quot;,&quot;product&quot;:&quot;OceanBasePro&quot;,&quot;version&quot;:&quot;2019-09-01&quot;,&quot;path&quot;:&quot;/&quot;,&quot;deprecated&quot;:0,&quot;method&quot;:&quot;POST|GET&quot;,&quot;protocol&quot;:&quot;HTTP|HTTPS&quot;,&quot;hidden&quot;:0,&quot;timeout&quot;:10000,&quot;parameter_type&quot;:&quot;Single&quot;,&quot;params&quot;:&quot;[{\&quot;name\&quot;:\&quot;Action\&quot;,\&quot;position\&quot;:\&quot;Query\&quot;,\&quot;required\&quot;:true,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;DescribeTenantMetrics\&quot;},{\&quot;name\&quot;:\&quot;InstanceId\&quot;,\&quot;position\&quot;:\&quot;Body\&quot;,\&quot;required\&quot;:true,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;ob317v4uif****\&quot;},{\&quot;name\&quot;:\&quot;PageSize\&quot;,\&quot;position\&quot;:\&quot;Body\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;Integer\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;10\&quot;},{\&quot;name\&quot;:\&quot;PageNumber\&quot;,\&quot;position\&quot;:\&quot;Body\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;Integer\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;1\&quot;},{\&quot;name\&quot;:\&quot;TenantName\&quot;,\&quot;position\&quot;:\&quot;Body\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:true,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;pay_online\&quot;},{\&quot;name\&quot;:\&quot;StartTime\&quot;,\&quot;position\&quot;:\&quot;Body\&quot;,\&quot;required\&quot;:true,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;2021-06-13T15:40:43Z\&quot;},{\&quot;name\&quot;:\&quot;EndTime\&quot;,\&quot;position\&quot;:\&quot;Body\&quot;,\&quot;required\&quot;:true,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;2021-06-13T15:45:43Z\&quot;},{\&quot;name\&quot;:\&quot;Metrics\&quot;,\&quot;position\&quot;:\&quot;Body\&quot;,\&quot;required\&quot;:true,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;tps\&quot;},{\&quot;name\&quot;:\&quot;TenantId\&quot;,\&quot;position\&quot;:\&quot;Body\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:true,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;tfafd34fs****\&quot;},{\&quot;name\&quot;:\&quot;TenantIdList\&quot;,\&quot;position\&quot;:\&quot;Body\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;[tdak3nac****,tdakc42df****]\&quot;}]&quot;,&quot;response_headers&quot;:&quot;[]&quot;,&quot;response&quot;:&quot;{\&quot;type\&quot;:\&quot;Object\&quot;,\&quot;children\&quot;:[{\&quot;name\&quot;:\&quot;TotalCount\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;Integer\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;9\&quot;},{\&quot;name\&quot;:\&quot;RequestId\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C\&quot;},{\&quot;name\&quot;:\&quot;TenantMetrics\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;\\\&quot;Metrics\\\&quot;:[ {\\\&quot;request_queue_rt\\\&quot;:0.0,\\\&quot;TimeStamp\\\&quot;:\\\&quot;2022-02-23T01:58:00Z\\\&quot;}]\&quot;}],\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;}&quot;,&quot;errors&quot;:&quot;{}&quot;}</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tps</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>tfafd34fs****</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Example 1</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-13T15:40:43Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>tfafd34fs****</p>
     */
    @NameInMap("TenantId")
    @Deprecated
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>[tdak3nac****,tdakc42df****]</p>
     */
    @NameInMap("TenantIdList")
    public String tenantIdList;

    /**
     * <p>2021-06-13T15:45:43Z</p>
     * 
     * <strong>example:</strong>
     * <p>pay_online</p>
     */
    @NameInMap("TenantName")
    @Deprecated
    public String tenantName;

    public static DescribeTenantMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantMetricsRequest self = new DescribeTenantMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTenantMetricsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTenantMetricsRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public DescribeTenantMetricsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTenantMetricsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTenantMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTenantMetricsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeTenantMetricsRequest setTenantIdList(String tenantIdList) {
        this.tenantIdList = tenantIdList;
        return this;
    }
    public String getTenantIdList() {
        return this.tenantIdList;
    }

    public DescribeTenantMetricsRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
