// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebStaticsInfo extends TeaModel {
    /**
     * <p>CPU usage</p>
     * 
     * <strong>example:</strong>
     * <p>1327</p>
     */
    @NameInMap("CpuUsage")
    public Long cpuUsage;

    /**
     * <p>Indicates outbound traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>2792</p>
     */
    @NameInMap("InternetTrafficOut")
    public Long internetTrafficOut;

    /**
     * <p>The number of times that the SQL statement is invoked.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Invocations")
    public Long invocations;

    /**
     * <p>The peak memory usage for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>5045929297920</p>
     */
    @NameInMap("MemoryUsage")
    public Long memoryUsage;

    public static WebStaticsInfo build(java.util.Map<String, ?> map) throws Exception {
        WebStaticsInfo self = new WebStaticsInfo();
        return TeaModel.build(map, self);
    }

    public WebStaticsInfo setCpuUsage(Long cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }
    public Long getCpuUsage() {
        return this.cpuUsage;
    }

    public WebStaticsInfo setInternetTrafficOut(Long internetTrafficOut) {
        this.internetTrafficOut = internetTrafficOut;
        return this;
    }
    public Long getInternetTrafficOut() {
        return this.internetTrafficOut;
    }

    public WebStaticsInfo setInvocations(Long invocations) {
        this.invocations = invocations;
        return this;
    }
    public Long getInvocations() {
        return this.invocations;
    }

    public WebStaticsInfo setMemoryUsage(Long memoryUsage) {
        this.memoryUsage = memoryUsage;
        return this;
    }
    public Long getMemoryUsage() {
        return this.memoryUsage;
    }

}
