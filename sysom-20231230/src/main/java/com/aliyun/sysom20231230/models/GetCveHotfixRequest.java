// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetCveHotfixRequest extends TeaModel {
    /**
     * <p>The list of CVE IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("cveIds")
    public java.util.List<String> cveIds;

    /**
     * <p>The list of full kernel versions.</p>
     */
    @NameInMap("kernelVersions")
    public java.util.List<String> kernelVersions;

    public static GetCveHotfixRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCveHotfixRequest self = new GetCveHotfixRequest();
        return TeaModel.build(map, self);
    }

    public GetCveHotfixRequest setCveIds(java.util.List<String> cveIds) {
        this.cveIds = cveIds;
        return this;
    }
    public java.util.List<String> getCveIds() {
        return this.cveIds;
    }

    public GetCveHotfixRequest setKernelVersions(java.util.List<String> kernelVersions) {
        this.kernelVersions = kernelVersions;
        return this;
    }
    public java.util.List<String> getKernelVersions() {
        return this.kernelVersions;
    }

}
