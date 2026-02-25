// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebInstancesOutput extends TeaModel {
    /**
     * <p>The error message of instance creation. If the instance creation was successful, this parameter is not returned.</p>
     */
    @NameInMap("CurrentError")
    public String currentError;

    /**
     * <p>The application instance.</p>
     */
    @NameInMap("WebInstances")
    public java.util.List<WebInstanceInfo> webInstances;

    /**
     * <p>The instance status.</p>
     */
    @NameInMap("WebVersionStatus")
    public java.util.Map<String, WebVersionStatus> webVersionStatus;

    public static ListWebInstancesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListWebInstancesOutput self = new ListWebInstancesOutput();
        return TeaModel.build(map, self);
    }

    public ListWebInstancesOutput setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
    }

    public ListWebInstancesOutput setWebInstances(java.util.List<WebInstanceInfo> webInstances) {
        this.webInstances = webInstances;
        return this;
    }
    public java.util.List<WebInstanceInfo> getWebInstances() {
        return this.webInstances;
    }

    public ListWebInstancesOutput setWebVersionStatus(java.util.Map<String, WebVersionStatus> webVersionStatus) {
        this.webVersionStatus = webVersionStatus;
        return this;
    }
    public java.util.Map<String, WebVersionStatus> getWebVersionStatus() {
        return this.webVersionStatus;
    }

}
