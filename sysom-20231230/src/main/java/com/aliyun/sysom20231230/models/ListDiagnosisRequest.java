// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListDiagnosisRequest extends TeaModel {
    @NameInMap("current")
    public Long current;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("params")
    public String params;

    @NameInMap("service_name")
    public String serviceName;

    @NameInMap("status")
    public String status;

    public static ListDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosisRequest self = new ListDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public ListDiagnosisRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListDiagnosisRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDiagnosisRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ListDiagnosisRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListDiagnosisRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
