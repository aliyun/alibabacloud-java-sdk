// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationServerlessConfRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
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
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("ScaleMax")
        public String scaleMax;

        /**
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
