// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListDiagnosisRequest extends TeaModel {
    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Diagnostic parameters. Different diagnosis types require different diagnostic parameters. You can use this field to filter records whose parameter values match the specified value.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;key\&quot;:\&quot;region\&quot;,\&quot;value\&quot;:\&quot;cn-beijing\&quot;}]</p>
     */
    @NameInMap("params")
    public String params;

    /**
     * <p>Diagnosis type</p>
     * 
     * <strong>example:</strong>
     * <p>memgraph</p>
     */
    @NameInMap("service_name")
    public String serviceName;

    /**
     * <p>Status of the diagnostic task execution.<br>Valid values:  </p>
     * <ul>
     * <li><strong>Ready</strong>: Ready  </li>
     * <li><strong>Running</strong>: Running  </li>
     * <li><strong>Success</strong>: Succeeded  </li>
     * <li><strong>Fail</strong>: Failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
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
