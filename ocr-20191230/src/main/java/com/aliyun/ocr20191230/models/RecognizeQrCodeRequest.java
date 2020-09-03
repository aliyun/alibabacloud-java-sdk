// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQrCodeRequest extends TeaModel {
    @NameInMap("Tasks")
    @Validation(required = true)
    public java.util.List<RecognizeQrCodeRequestTasks> tasks;

    public static RecognizeQrCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQrCodeRequest self = new RecognizeQrCodeRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeQrCodeRequest setTasks(java.util.List<RecognizeQrCodeRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<RecognizeQrCodeRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class RecognizeQrCodeRequestTasks extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static RecognizeQrCodeRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQrCodeRequestTasks self = new RecognizeQrCodeRequestTasks();
            return TeaModel.build(map, self);
        }

        public RecognizeQrCodeRequestTasks setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
