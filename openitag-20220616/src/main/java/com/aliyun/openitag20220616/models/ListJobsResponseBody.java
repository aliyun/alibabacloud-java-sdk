// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    /**
     * <p>Return code. The default value is 0, indicating normal execution.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Details.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Details")
    public String details;

    /**
     * <p>Error code.</p>
     * <ul>
     * <li>When Success is false, returns a business error code.</li>
     * <li>When Success is true, returns an empty value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>List of jobs.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<Job> jobs;

    /**
     * <p>Response message of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Page number of the returned list of queried annotation results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of annotation results displayed per page in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90ABA848-AD74-1F6E-84BC-4182A7F1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded. Valid values:</p>
     * <ul>
     * <li>true: Succeeded.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of annotation results.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListJobsResponseBody setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public ListJobsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListJobsResponseBody setJobs(java.util.List<Job> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<Job> getJobs() {
        return this.jobs;
    }

    public ListJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListJobsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

}
