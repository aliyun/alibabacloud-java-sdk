// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationServerlessConfRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The serverless configuration list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ServerlessConfList")
    public java.util.List<ModifyApplicationServerlessConfRequestServerlessConfList> serverlessConfList;

    public static ModifyApplicationServerlessConfRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationServerlessConfRequest self = new ModifyApplicationServerlessConfRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationServerlessConfRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationServerlessConfRequest setServerlessConfList(java.util.List<ModifyApplicationServerlessConfRequestServerlessConfList> serverlessConfList) {
        this.serverlessConfList = serverlessConfList;
        return this;
    }
    public java.util.List<ModifyApplicationServerlessConfRequestServerlessConfList> getServerlessConfList() {
        return this.serverlessConfList;
    }

    public static class ModifyApplicationServerlessConfRequestServerlessConfList extends TeaModel {
        /**
         * <p>The type of the application subcomponent. For supabase, valid values:</p>
         * <ul>
         * <li>gateway</li>
         * <li>backend</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The upper limit of scaling per node. Valid values: 0 to 16 PCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("ScaleMax")
        public String scaleMax;

        /**
         * <p>The lower limit of scaling per node. Valid values: 0 to 16 PCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScaleMin")
        public String scaleMin;

        public static ModifyApplicationServerlessConfRequestServerlessConfList build(java.util.Map<String, ?> map) throws Exception {
            ModifyApplicationServerlessConfRequestServerlessConfList self = new ModifyApplicationServerlessConfRequestServerlessConfList();
            return TeaModel.build(map, self);
        }

        public ModifyApplicationServerlessConfRequestServerlessConfList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public ModifyApplicationServerlessConfRequestServerlessConfList setScaleMax(String scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public String getScaleMax() {
            return this.scaleMax;
        }

        public ModifyApplicationServerlessConfRequestServerlessConfList setScaleMin(String scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public String getScaleMin() {
            return this.scaleMin;
        }

    }

}
