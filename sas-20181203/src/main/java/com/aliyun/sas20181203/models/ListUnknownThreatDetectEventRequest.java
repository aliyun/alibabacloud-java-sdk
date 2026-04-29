// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectEventRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>0a212417e65c26ff133cfff28f6c****</p>
     */
    @NameInMap("HashKey")
    public String hashKey;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>/bin/bash</p>
     */
    @NameInMap("ParentProcessPath")
    public String parentProcessPath;

    /**
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("ProcessPath")
    public String processPath;

    /**
     * <strong>example:</strong>
     * <p>10.167.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>18b7336e-d469-473b-af83-8e5420f9****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListUnknownThreatDetectEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectEventRequest self = new ListUnknownThreatDetectEventRequest();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUnknownThreatDetectEventRequest setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }
    public String getHashKey() {
        return this.hashKey;
    }

    public ListUnknownThreatDetectEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUnknownThreatDetectEventRequest setParentProcessPath(String parentProcessPath) {
        this.parentProcessPath = parentProcessPath;
        return this;
    }
    public String getParentProcessPath() {
        return this.parentProcessPath;
    }

    public ListUnknownThreatDetectEventRequest setProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }
    public String getProcessPath() {
        return this.processPath;
    }

    public ListUnknownThreatDetectEventRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListUnknownThreatDetectEventRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListUnknownThreatDetectEventRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
