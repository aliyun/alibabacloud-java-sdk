// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopCategoryCallbackRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>223***JQb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Callback")
    public StopCategoryCallbackRequestCallback callback;

    public static StopCategoryCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCategoryCallbackRequest self = new StopCategoryCallbackRequest();
        return TeaModel.build(map, self);
    }

    public StopCategoryCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopCategoryCallbackRequest setCallback(StopCategoryCallbackRequestCallback callback) {
        this.callback = callback;
        return this;
    }
    public StopCategoryCallbackRequestCallback getCallback() {
        return this.callback;
    }

    public static class StopCategoryCallbackRequestCallback extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RecordEvent</p>
         */
        @NameInMap("Category")
        public String category;

        public static StopCategoryCallbackRequestCallback build(java.util.Map<String, ?> map) throws Exception {
            StopCategoryCallbackRequestCallback self = new StopCategoryCallbackRequestCallback();
            return TeaModel.build(map, self);
        }

        public StopCategoryCallbackRequestCallback setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

}
