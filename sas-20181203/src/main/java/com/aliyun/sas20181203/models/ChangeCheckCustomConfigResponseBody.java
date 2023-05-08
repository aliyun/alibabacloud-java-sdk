// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckCustomConfigResponseBody extends TeaModel {
    @NameInMap("IllegalCustomConfigs")
    public java.util.List<ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs> illegalCustomConfigs;

    @NameInMap("RequestId")
    public String requestId;

    public static ChangeCheckCustomConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckCustomConfigResponseBody self = new ChangeCheckCustomConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeCheckCustomConfigResponseBody setIllegalCustomConfigs(java.util.List<ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs> illegalCustomConfigs) {
        this.illegalCustomConfigs = illegalCustomConfigs;
        return this;
    }
    public java.util.List<ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs> getIllegalCustomConfigs() {
        return this.illegalCustomConfigs;
    }

    public ChangeCheckCustomConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs self = new ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs();
            return TeaModel.build(map, self);
        }

        public ChangeCheckCustomConfigResponseBodyIllegalCustomConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
