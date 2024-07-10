// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebStaticsInfo extends TeaModel {
    @NameInMap("CpuUsage")
    public Long cpuUsage;

    @NameInMap("InternetTrafficOut")
    public Long internetTrafficOut;

    @NameInMap("Invocations")
    public Long invocations;

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
