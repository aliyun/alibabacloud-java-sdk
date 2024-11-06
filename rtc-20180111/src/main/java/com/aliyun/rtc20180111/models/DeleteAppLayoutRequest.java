// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppLayoutRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Layout")
    public DeleteAppLayoutRequestLayout layout;

    public static DeleteAppLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppLayoutRequest self = new DeleteAppLayoutRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppLayoutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppLayoutRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteAppLayoutRequest setLayout(DeleteAppLayoutRequestLayout layout) {
        this.layout = layout;
        return this;
    }
    public DeleteAppLayoutRequestLayout getLayout() {
        return this.layout;
    }

    public static class DeleteAppLayoutRequestLayout extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>167466539798442****</p>
         */
        @NameInMap("LayoutId")
        public String layoutId;

        public static DeleteAppLayoutRequestLayout build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppLayoutRequestLayout self = new DeleteAppLayoutRequestLayout();
            return TeaModel.build(map, self);
        }

        public DeleteAppLayoutRequestLayout setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

    }

}
