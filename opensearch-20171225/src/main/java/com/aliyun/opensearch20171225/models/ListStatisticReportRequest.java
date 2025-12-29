// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListStatisticReportRequest extends TeaModel {
    /**
     * <p>The fields to query. Set this parameter in the format of columns=&quot;pv,uv,ipv&quot;. For more information, see <a href="https://help.aliyun.com/document_detail/187665.html">Metrics of statistical reports</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>pv,uv</p>
     */
    @NameInMap("columns")
    public String columns;

    /**
     * <p>The end timestamp of the query. By default, the end time is the current time. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1582646399</p>
     */
    @NameInMap("endTime")
    public Integer endTime;

    /**
     * <p>The page number.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The query conditions. Set this parameter in the format of k1:v1,k2:v2. Valid values:</p>
     * <ul>
     * <li>experimentSerialNumber: the globally unique sequence number of the test</li>
     * <li>sceneTag: the tag of the test scenario</li>
     * <li>bizType: the type of the business</li>
     * <li>modelId: the ID of the algorithm model</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bizType:test,sceneTag:myTag</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The start timestamp of the query. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1582214400</p>
     */
    @NameInMap("startTime")
    public Integer startTime;

    public static ListStatisticReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStatisticReportRequest self = new ListStatisticReportRequest();
        return TeaModel.build(map, self);
    }

    public ListStatisticReportRequest setColumns(String columns) {
        this.columns = columns;
        return this;
    }
    public String getColumns() {
        return this.columns;
    }

    public ListStatisticReportRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ListStatisticReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStatisticReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStatisticReportRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListStatisticReportRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
