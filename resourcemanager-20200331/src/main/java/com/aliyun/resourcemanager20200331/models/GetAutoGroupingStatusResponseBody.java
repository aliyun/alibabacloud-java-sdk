// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAutoGroupingStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the Transfer Existing Associated Resources feature is enabled. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableExistedResourcesTransfer")
    public Boolean enableExistedResourcesTransfer;

    /**
     * <p>The status of the Automatic Resource Transfer feature. Valid values:</p>
     * <ul>
     * <li>Enabling: The feature is being enabled.</li>
     * <li>Enable: The feature is enabled.</li>
     * <li>Partial_Enable: The transfer of associated resources is enabled, but custom transfer rule-based resource transfer is disabled. You can call the <a href="https://help.aliyun.com/document_detail/2870380.html">EnableAutoGrouping</a> operation to enable custom transfer rule-based resource transfer.</li>
     * <li>Disable: The feature is disabled.</li>
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
