// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-********************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Components")
    public java.util.List<CreateApplicationResponseBodyComponents> components;

    /**
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2148126708*****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResourceAvailable")
    public Boolean resourceAvailable;

    /**
     * <strong>example:</strong>
     * <p>rg-********************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponseBody self = new CreateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationResponseBody setComponents(java.util.List<CreateApplicationResponseBodyComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<CreateApplicationResponseBodyComponents> getComponents() {
        return this.components;
    }

    public CreateApplicationResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationResponseBody setResourceAvailable(Boolean resourceAvailable) {
        this.resourceAvailable = resourceAvailable;
        return this;
    }
    public Boolean getResourceAvailable() {
        return this.resourceAvailable;
    }

    public CreateApplicationResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class CreateApplicationResponseBodyComponents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pac-********************</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        public static CreateApplicationResponseBodyComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyComponents self = new CreateApplicationResponseBodyComponents();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyComponents setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

    }

}
