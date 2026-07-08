// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RenewRenderingInstanceRequest extends TeaModel {
    /**
     * <p>Enable or disable auto-renewal. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable.</p>
     * </li>
     * <li><p><strong>false</strong>: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The duration of the subscription. Valid values are 1 (default), 2, 3, 4, 5, 6, 7, 8, 9, 12. A value of 12 is converted to one year; other values are in months.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>Cloud application service instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static RenewRenderingInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewRenderingInstanceRequest self = new RenewRenderingInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewRenderingInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RenewRenderingInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public RenewRenderingInstanceRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
