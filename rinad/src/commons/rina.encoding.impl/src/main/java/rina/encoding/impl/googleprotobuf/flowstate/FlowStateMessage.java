// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FlowStateMessage.proto

package rina.encoding.impl.googleprotobuf.flowstate;

public final class FlowStateMessage {
  private FlowStateMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface flowStateObject_tOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 address = 1;
    /**
     * <code>optional uint64 address = 1;</code>
     *
     * <pre>
     * The address of the IPC Process
     * </pre>
     */
    boolean hasAddress();
    /**
     * <code>optional uint64 address = 1;</code>
     *
     * <pre>
     * The address of the IPC Process
     * </pre>
     */
    long getAddress();

    // required uint32 portid = 2;
    /**
     * <code>required uint32 portid = 2;</code>
     *
     * <pre>
     * The port-id of the N-1 flow
     * </pre>
     */
    boolean hasPortid();
    /**
     * <code>required uint32 portid = 2;</code>
     *
     * <pre>
     * The port-id of the N-1 flow
     * </pre>
     */
    int getPortid();

    // optional uint64 neighbor_address = 3;
    /**
     * <code>optional uint64 neighbor_address = 3;</code>
     *
     * <pre>
     * The address of the neighbor IPC Process	
     * </pre>
     */
    boolean hasNeighborAddress();
    /**
     * <code>optional uint64 neighbor_address = 3;</code>
     *
     * <pre>
     * The address of the neighbor IPC Process	
     * </pre>
     */
    long getNeighborAddress();

    // required uint32 neighbor_portid = 4;
    /**
     * <code>required uint32 neighbor_portid = 4;</code>
     *
     * <pre>
     * The port_id assigned by the neighbor IPC Process to the N-1 flow
     * </pre>
     */
    boolean hasNeighborPortid();
    /**
     * <code>required uint32 neighbor_portid = 4;</code>
     *
     * <pre>
     * The port_id assigned by the neighbor IPC Process to the N-1 flow
     * </pre>
     */
    int getNeighborPortid();

    // optional bool state = 5;
    /**
     * <code>optional bool state = 5;</code>
     *
     * <pre>
     * Flow up (true) or down (false) 
     * </pre>
     */
    boolean hasState();
    /**
     * <code>optional bool state = 5;</code>
     *
     * <pre>
     * Flow up (true) or down (false) 
     * </pre>
     */
    boolean getState();

    // optional uint32 sequence_number = 6;
    /**
     * <code>optional uint32 sequence_number = 6;</code>
     *
     * <pre>
     * A sequence number to be able to discard old information
     * </pre>
     */
    boolean hasSequenceNumber();
    /**
     * <code>optional uint32 sequence_number = 6;</code>
     *
     * <pre>
     * A sequence number to be able to discard old information
     * </pre>
     */
    int getSequenceNumber();

    // optional uint32 age = 7;
    /**
     * <code>optional uint32 age = 7;</code>
     *
     * <pre>
     * Age of this FSO (in seconds)
     * </pre>
     */
    boolean hasAge();
    /**
     * <code>optional uint32 age = 7;</code>
     *
     * <pre>
     * Age of this FSO (in seconds)
     * </pre>
     */
    int getAge();
  }
  /**
   * Protobuf type {@code rina.messages.flowStateObject_t}
   *
   * <pre>
   * Contains the information of a flow object
   * </pre>
   */
  public static final class flowStateObject_t extends
      com.google.protobuf.GeneratedMessage
      implements flowStateObject_tOrBuilder {
    // Use flowStateObject_t.newBuilder() to construct.
    private flowStateObject_t(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private flowStateObject_t(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final flowStateObject_t defaultInstance;
    public static flowStateObject_t getDefaultInstance() {
      return defaultInstance;
    }

    public flowStateObject_t getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private flowStateObject_t(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              address_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              portid_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              neighborAddress_ = input.readUInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              neighborPortid_ = input.readUInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              state_ = input.readBool();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              sequenceNumber_ = input.readUInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              age_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.internal_static_rina_messages_flowStateObject_t_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.internal_static_rina_messages_flowStateObject_t_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.class, rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.Builder.class);
    }

    public static com.google.protobuf.Parser<flowStateObject_t> PARSER =
        new com.google.protobuf.AbstractParser<flowStateObject_t>() {
      public flowStateObject_t parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new flowStateObject_t(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<flowStateObject_t> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional uint64 address = 1;
    public static final int ADDRESS_FIELD_NUMBER = 1;
    private long address_;
    /**
     * <code>optional uint64 address = 1;</code>
     *
     * <pre>
     * The address of the IPC Process
     * </pre>
     */
    public boolean hasAddress() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 address = 1;</code>
     *
     * <pre>
     * The address of the IPC Process
     * </pre>
     */
    public long getAddress() {
      return address_;
    }

    // required uint32 portid = 2;
    public static final int PORTID_FIELD_NUMBER = 2;
    private int portid_;
    /**
     * <code>required uint32 portid = 2;</code>
     *
     * <pre>
     * The port-id of the N-1 flow
     * </pre>
     */
    public boolean hasPortid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 portid = 2;</code>
     *
     * <pre>
     * The port-id of the N-1 flow
     * </pre>
     */
    public int getPortid() {
      return portid_;
    }

    // optional uint64 neighbor_address = 3;
    public static final int NEIGHBOR_ADDRESS_FIELD_NUMBER = 3;
    private long neighborAddress_;
    /**
     * <code>optional uint64 neighbor_address = 3;</code>
     *
     * <pre>
     * The address of the neighbor IPC Process	
     * </pre>
     */
    public boolean hasNeighborAddress() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 neighbor_address = 3;</code>
     *
     * <pre>
     * The address of the neighbor IPC Process	
     * </pre>
     */
    public long getNeighborAddress() {
      return neighborAddress_;
    }

    // required uint32 neighbor_portid = 4;
    public static final int NEIGHBOR_PORTID_FIELD_NUMBER = 4;
    private int neighborPortid_;
    /**
     * <code>required uint32 neighbor_portid = 4;</code>
     *
     * <pre>
     * The port_id assigned by the neighbor IPC Process to the N-1 flow
     * </pre>
     */
    public boolean hasNeighborPortid() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required uint32 neighbor_portid = 4;</code>
     *
     * <pre>
     * The port_id assigned by the neighbor IPC Process to the N-1 flow
     * </pre>
     */
    public int getNeighborPortid() {
      return neighborPortid_;
    }

    // optional bool state = 5;
    public static final int STATE_FIELD_NUMBER = 5;
    private boolean state_;
    /**
     * <code>optional bool state = 5;</code>
     *
     * <pre>
     * Flow up (true) or down (false) 
     * </pre>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool state = 5;</code>
     *
     * <pre>
     * Flow up (true) or down (false) 
     * </pre>
     */
    public boolean getState() {
      return state_;
    }

    // optional uint32 sequence_number = 6;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 6;
    private int sequenceNumber_;
    /**
     * <code>optional uint32 sequence_number = 6;</code>
     *
     * <pre>
     * A sequence number to be able to discard old information
     * </pre>
     */
    public boolean hasSequenceNumber() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional uint32 sequence_number = 6;</code>
     *
     * <pre>
     * A sequence number to be able to discard old information
     * </pre>
     */
    public int getSequenceNumber() {
      return sequenceNumber_;
    }

    // optional uint32 age = 7;
    public static final int AGE_FIELD_NUMBER = 7;
    private int age_;
    /**
     * <code>optional uint32 age = 7;</code>
     *
     * <pre>
     * Age of this FSO (in seconds)
     * </pre>
     */
    public boolean hasAge() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional uint32 age = 7;</code>
     *
     * <pre>
     * Age of this FSO (in seconds)
     * </pre>
     */
    public int getAge() {
      return age_;
    }

    private void initFields() {
      address_ = 0L;
      portid_ = 0;
      neighborAddress_ = 0L;
      neighborPortid_ = 0;
      state_ = false;
      sequenceNumber_ = 0;
      age_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasPortid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNeighborPortid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, address_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, portid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, neighborAddress_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, neighborPortid_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, state_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt32(6, sequenceNumber_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt32(7, age_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, address_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, portid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, neighborAddress_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, neighborPortid_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, state_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, sequenceNumber_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, age_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code rina.messages.flowStateObject_t}
     *
     * <pre>
     * Contains the information of a flow object
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_tOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.internal_static_rina_messages_flowStateObject_t_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.internal_static_rina_messages_flowStateObject_t_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.class, rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.Builder.class);
      }

      // Construct using rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        address_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        portid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        neighborAddress_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        neighborPortid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        state_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        sequenceNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        age_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.internal_static_rina_messages_flowStateObject_t_descriptor;
      }

      public rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t getDefaultInstanceForType() {
        return rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.getDefaultInstance();
      }

      public rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t build() {
        rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t buildPartial() {
        rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t result = new rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.address_ = address_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.portid_ = portid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.neighborAddress_ = neighborAddress_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.neighborPortid_ = neighborPortid_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.sequenceNumber_ = sequenceNumber_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.age_ = age_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t) {
          return mergeFrom((rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t other) {
        if (other == rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t.getDefaultInstance()) return this;
        if (other.hasAddress()) {
          setAddress(other.getAddress());
        }
        if (other.hasPortid()) {
          setPortid(other.getPortid());
        }
        if (other.hasNeighborAddress()) {
          setNeighborAddress(other.getNeighborAddress());
        }
        if (other.hasNeighborPortid()) {
          setNeighborPortid(other.getNeighborPortid());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasSequenceNumber()) {
          setSequenceNumber(other.getSequenceNumber());
        }
        if (other.hasAge()) {
          setAge(other.getAge());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasPortid()) {
          
          return false;
        }
        if (!hasNeighborPortid()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (rina.encoding.impl.googleprotobuf.flowstate.FlowStateMessage.flowStateObject_t) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional uint64 address = 1;
      private long address_ ;
      /**
       * <code>optional uint64 address = 1;</code>
       *
       * <pre>
       * The address of the IPC Process
       * </pre>
       */
      public boolean hasAddress() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 address = 1;</code>
       *
       * <pre>
       * The address of the IPC Process
       * </pre>
       */
      public long getAddress() {
        return address_;
      }
      /**
       * <code>optional uint64 address = 1;</code>
       *
       * <pre>
       * The address of the IPC Process
       * </pre>
       */
      public Builder setAddress(long value) {
        bitField0_ |= 0x00000001;
        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 address = 1;</code>
       *
       * <pre>
       * The address of the IPC Process
       * </pre>
       */
      public Builder clearAddress() {
        bitField0_ = (bitField0_ & ~0x00000001);
        address_ = 0L;
        onChanged();
        return this;
      }

      // required uint32 portid = 2;
      private int portid_ ;
      /**
       * <code>required uint32 portid = 2;</code>
       *
       * <pre>
       * The port-id of the N-1 flow
       * </pre>
       */
      public boolean hasPortid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 portid = 2;</code>
       *
       * <pre>
       * The port-id of the N-1 flow
       * </pre>
       */
      public int getPortid() {
        return portid_;
      }
      /**
       * <code>required uint32 portid = 2;</code>
       *
       * <pre>
       * The port-id of the N-1 flow
       * </pre>
       */
      public Builder setPortid(int value) {
        bitField0_ |= 0x00000002;
        portid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 portid = 2;</code>
       *
       * <pre>
       * The port-id of the N-1 flow
       * </pre>
       */
      public Builder clearPortid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        portid_ = 0;
        onChanged();
        return this;
      }

      // optional uint64 neighbor_address = 3;
      private long neighborAddress_ ;
      /**
       * <code>optional uint64 neighbor_address = 3;</code>
       *
       * <pre>
       * The address of the neighbor IPC Process	
       * </pre>
       */
      public boolean hasNeighborAddress() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint64 neighbor_address = 3;</code>
       *
       * <pre>
       * The address of the neighbor IPC Process	
       * </pre>
       */
      public long getNeighborAddress() {
        return neighborAddress_;
      }
      /**
       * <code>optional uint64 neighbor_address = 3;</code>
       *
       * <pre>
       * The address of the neighbor IPC Process	
       * </pre>
       */
      public Builder setNeighborAddress(long value) {
        bitField0_ |= 0x00000004;
        neighborAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 neighbor_address = 3;</code>
       *
       * <pre>
       * The address of the neighbor IPC Process	
       * </pre>
       */
      public Builder clearNeighborAddress() {
        bitField0_ = (bitField0_ & ~0x00000004);
        neighborAddress_ = 0L;
        onChanged();
        return this;
      }

      // required uint32 neighbor_portid = 4;
      private int neighborPortid_ ;
      /**
       * <code>required uint32 neighbor_portid = 4;</code>
       *
       * <pre>
       * The port_id assigned by the neighbor IPC Process to the N-1 flow
       * </pre>
       */
      public boolean hasNeighborPortid() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required uint32 neighbor_portid = 4;</code>
       *
       * <pre>
       * The port_id assigned by the neighbor IPC Process to the N-1 flow
       * </pre>
       */
      public int getNeighborPortid() {
        return neighborPortid_;
      }
      /**
       * <code>required uint32 neighbor_portid = 4;</code>
       *
       * <pre>
       * The port_id assigned by the neighbor IPC Process to the N-1 flow
       * </pre>
       */
      public Builder setNeighborPortid(int value) {
        bitField0_ |= 0x00000008;
        neighborPortid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 neighbor_portid = 4;</code>
       *
       * <pre>
       * The port_id assigned by the neighbor IPC Process to the N-1 flow
       * </pre>
       */
      public Builder clearNeighborPortid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        neighborPortid_ = 0;
        onChanged();
        return this;
      }

      // optional bool state = 5;
      private boolean state_ ;
      /**
       * <code>optional bool state = 5;</code>
       *
       * <pre>
       * Flow up (true) or down (false) 
       * </pre>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bool state = 5;</code>
       *
       * <pre>
       * Flow up (true) or down (false) 
       * </pre>
       */
      public boolean getState() {
        return state_;
      }
      /**
       * <code>optional bool state = 5;</code>
       *
       * <pre>
       * Flow up (true) or down (false) 
       * </pre>
       */
      public Builder setState(boolean value) {
        bitField0_ |= 0x00000010;
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool state = 5;</code>
       *
       * <pre>
       * Flow up (true) or down (false) 
       * </pre>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000010);
        state_ = false;
        onChanged();
        return this;
      }

      // optional uint32 sequence_number = 6;
      private int sequenceNumber_ ;
      /**
       * <code>optional uint32 sequence_number = 6;</code>
       *
       * <pre>
       * A sequence number to be able to discard old information
       * </pre>
       */
      public boolean hasSequenceNumber() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional uint32 sequence_number = 6;</code>
       *
       * <pre>
       * A sequence number to be able to discard old information
       * </pre>
       */
      public int getSequenceNumber() {
        return sequenceNumber_;
      }
      /**
       * <code>optional uint32 sequence_number = 6;</code>
       *
       * <pre>
       * A sequence number to be able to discard old information
       * </pre>
       */
      public Builder setSequenceNumber(int value) {
        bitField0_ |= 0x00000020;
        sequenceNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 sequence_number = 6;</code>
       *
       * <pre>
       * A sequence number to be able to discard old information
       * </pre>
       */
      public Builder clearSequenceNumber() {
        bitField0_ = (bitField0_ & ~0x00000020);
        sequenceNumber_ = 0;
        onChanged();
        return this;
      }

      // optional uint32 age = 7;
      private int age_ ;
      /**
       * <code>optional uint32 age = 7;</code>
       *
       * <pre>
       * Age of this FSO (in seconds)
       * </pre>
       */
      public boolean hasAge() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional uint32 age = 7;</code>
       *
       * <pre>
       * Age of this FSO (in seconds)
       * </pre>
       */
      public int getAge() {
        return age_;
      }
      /**
       * <code>optional uint32 age = 7;</code>
       *
       * <pre>
       * Age of this FSO (in seconds)
       * </pre>
       */
      public Builder setAge(int value) {
        bitField0_ |= 0x00000040;
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 age = 7;</code>
       *
       * <pre>
       * Age of this FSO (in seconds)
       * </pre>
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000040);
        age_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:rina.messages.flowStateObject_t)
    }

    static {
      defaultInstance = new flowStateObject_t(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:rina.messages.flowStateObject_t)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_rina_messages_flowStateObject_t_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_rina_messages_flowStateObject_t_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FlowStateMessage.proto\022\rrina.messages\"" +
      "\234\001\n\021flowStateObject_t\022\017\n\007address\030\001 \001(\004\022\016" +
      "\n\006portid\030\002 \002(\r\022\030\n\020neighbor_address\030\003 \001(\004" +
      "\022\027\n\017neighbor_portid\030\004 \002(\r\022\r\n\005state\030\005 \001(\010" +
      "\022\027\n\017sequence_number\030\006 \001(\r\022\013\n\003age\030\007 \001(\rB-" +
      "\n+rina.encoding.impl.googleprotobuf.flow" +
      "state"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_rina_messages_flowStateObject_t_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_rina_messages_flowStateObject_t_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_rina_messages_flowStateObject_t_descriptor,
              new java.lang.String[] { "Address", "Portid", "NeighborAddress", "NeighborPortid", "State", "SequenceNumber", "Age", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}