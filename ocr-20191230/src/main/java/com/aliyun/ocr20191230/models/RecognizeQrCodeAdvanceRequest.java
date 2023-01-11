// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQrCodeAdvanceRequest extends TeaModel {
    /**
     * <p>1</p>
     */
    @NameInMap("Tasks")
    public java.util.List<RecognizeQrCodeAdvanceRequestTasks> tasks;

    public static RecognizeQrCodeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQrCodeAdvanceRequest self = new RecognizeQrCodeAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeQrCodeAdvanceRequest setTasks(java.util.List<RecognizeQrCodeAdvanceRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<RecognizeQrCodeAdvanceRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class RecognizeQrCodeAdvanceRequestTasks extends TeaModel {
        @NameInMap("ImageURL")
        public java.io.InputStream imageURLObject;

        public static RecognizeQrCodeAdvanceRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQrCodeAdvanceRequestTasks self = new RecognizeQrCodeAdvanceRequestTasks();
            return TeaModel.build(map, self);
        }

        public RecognizeQrCodeAdvanceRequestTasks setImageURLObject(java.io.InputStream imageURLObject) {
            this.imageURLObject = imageURLObject;
            return this;
        }
        public java.io.InputStream getImageURLObject() {
            return this.imageURLObject;
        }

    }

}
