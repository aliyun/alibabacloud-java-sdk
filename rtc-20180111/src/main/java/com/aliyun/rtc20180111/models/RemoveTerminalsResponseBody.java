// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RemoveTerminalsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Terminals")
    public RemoveTerminalsResponseBodyTerminals terminals;

    public static RemoveTerminalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveTerminalsResponseBody self = new RemoveTerminalsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveTerminalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveTerminalsResponseBody setTerminals(RemoveTerminalsResponseBodyTerminals terminals) {
        this.terminals = terminals;
        return this;
    }
    public RemoveTerminalsResponseBodyTerminals getTerminals() {
        return this.terminals;
    }

    public static class RemoveTerminalsResponseBodyTerminalsTerminal extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <strong>example:</strong>
         * <p>1811****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Message")
        public String message;

        public static RemoveTerminalsResponseBodyTerminalsTerminal build(java.util.Map<String, ?> map) throws Exception {
            RemoveTerminalsResponseBodyTerminalsTerminal self = new RemoveTerminalsResponseBodyTerminalsTerminal();
            return TeaModel.build(map, self);
        }

        public RemoveTerminalsResponseBodyTerminalsTerminal setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public RemoveTerminalsResponseBodyTerminalsTerminal setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RemoveTerminalsResponseBodyTerminalsTerminal setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class RemoveTerminalsResponseBodyTerminals extends TeaModel {
        @NameInMap("Terminal")
        public java.util.List<RemoveTerminalsResponseBodyTerminalsTerminal> terminal;

        public static RemoveTerminalsResponseBodyTerminals build(java.util.Map<String, ?> map) throws Exception {
            RemoveTerminalsResponseBodyTerminals self = new RemoveTerminalsResponseBodyTerminals();
            return TeaModel.build(map, self);
        }

        public RemoveTerminalsResponseBodyTerminals setTerminal(java.util.List<RemoveTerminalsResponseBodyTerminalsTerminal> terminal) {
            this.terminal = terminal;
            return this;
        }
        public java.util.List<RemoveTerminalsResponseBodyTerminalsTerminal> getTerminal() {
            return this.terminal;
        }

    }

}
