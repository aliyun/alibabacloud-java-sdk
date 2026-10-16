// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAutoGroupingStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the attached-resource allocation for existing resources is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableExistedResourcesTransfer")
    public Boolean enableExistedResourcesTransfer;

    /**
     * <p>The status of automatic resource group transfer. Valid values:</p>
     * <ul>
     * <li>Enabling: Being enabled.</li>
     * <li>Enable: Enabled.</li>
     * <li>Partial_Enable: Attached-resource allocation is enabled, but custom condition-based resource group transfer is not enabled. To enable custom condition-based resource group transfer, call <a href="~~EnableAutoGrouping~~">EnableAutoGrouping</a>.</li>
     * <li>Disable: Not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0217AFEB-5318-56D4-B167-1933D83EDF3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAutoGroupingStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoGroupingStatusResponseBody self = new GetAutoGroupingStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoGroupingStatusResponseBody setEnableExistedResourcesTransfer(Boolean enableExistedResourcesTransfer) {
        this.enableExistedResourcesTransfer = enableExistedResourcesTransfer;
        return this;
    }
    public Boolean getEnableExistedResourcesTransfer() {
        return this.enableExistedResourcesTransfer;
    }

    public GetAutoGroupingStatusResponseBody setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public GetAutoGroupingStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
