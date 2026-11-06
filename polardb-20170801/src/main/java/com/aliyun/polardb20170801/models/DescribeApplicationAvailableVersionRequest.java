// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationAvailableVersionRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The application type.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The list of application subcomponents.</p>
     */
    @NameInMap("Components")
    public java.util.List<DescribeApplicationAvailableVersionRequestComponents> components;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeApplicationAvailableVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAvailableVersionRequest self = new DescribeApplicationAvailableVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAvailableVersionRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationAvailableVersionRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public DescribeApplicationAvailableVersionRequest setComponents(java.util.List<DescribeApplicationAvailableVersionRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<DescribeApplicationAvailableVersionRequestComponents> getComponents() {
        return this.components;
    }

    public DescribeApplicationAvailableVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DescribeApplicationAvailableVersionRequestComponents extends TeaModel {
        /**
         * <p>The specifications of the application subcomponent.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.app.g2.medium</p>
         */
        @NameInMap("ComponentClass")
        public String componentClass;

        /**
         * <p>The maximum number of application subcomponents of the same specifications. Default value: the value of ComponentReplica. This parameter is supported only by raycluster applications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentMaxReplica")
        public Long componentMaxReplica;

        /**
         * <p>The number of replicas for the application subcomponent. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentReplica")
        public Long componentReplica;

        /**
         * <p>The type of the application subcomponent.</p>
         * 
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        public static DescribeApplicationAvailableVersionRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableVersionRequestComponents self = new DescribeApplicationAvailableVersionRequestComponents();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableVersionRequestComponents setComponentClass(String componentClass) {
            this.componentClass = componentClass;
            return this;
        }
        public String getComponentClass() {
            return this.componentClass;
        }

        public DescribeApplicationAvailableVersionRequestComponents setComponentMaxReplica(Long componentMaxReplica) {
            this.componentMaxReplica = componentMaxReplica;
            return this;
        }
        public Long getComponentMaxReplica() {
            return this.componentMaxReplica;
        }

        public DescribeApplicationAvailableVersionRequestComponents setComponentReplica(Long componentReplica) {
            this.componentReplica = componentReplica;
            return this;
        }
        public Long getComponentReplica() {
            return this.componentReplica;
        }

        public DescribeApplicationAvailableVersionRequestComponents setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

    }

}
